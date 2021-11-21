package td7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class DirMonitor {
	private static String HOME = System.getProperty("user.home");
	static Path p;

	public static void main(String[] args) throws IOException {
		Path f = Paths.get(".");
		DirMonitor d = new DirMonitor(f);
//		System.out.println(d.newDirectoryStream());
//		System.out.println(d.sizeOfFiles());
//		System.out.println(d.mostRecent());
		PrefixFilter pref =  new DirMonitor(f).new PrefixFilter();
		pref.accept(f);

	}

	public DirMonitor(Path p) throws FileNotFoundException {
		if (Files.isReadable(p) == true && Files.isDirectory(p) == true) {
			this.p = p;
		} else {
			throw new FileNotFoundException();
		}
	}
	public StringBuilder newDirectoryStream() throws IOException {
		StringBuilder s = new StringBuilder();
		try (Stream<Path> filePathStream=Files.walk(Paths.get(p.toString()))) {
		    filePathStream.forEach(filePath -> {
		        if (Files.isRegularFile(filePath)) {
		            String j =filePath.toString();
		            s.append(j);
		            s.append("\n");
		        }
		    });
		}
		return s;
	}
	
	public long sizeOfFiles() throws IOException {
	    long size = Files.walk(this.p)
	      .filter(p -> p.toFile().isFile())
	      .mapToLong(p -> p.toFile().length())
	      .sum();
	     return size;
	}
	
	public Path mostRecent() throws IOException {
		 if (Files.isDirectory(this.p)) {
		        Optional<Path> opPath = Files.list(this.p)
		          .filter(p -> !Files.isDirectory(p))
		          .sorted((p1, p2)-> Long.valueOf(p2.toFile().lastModified())
		            .compareTo(p1.toFile().lastModified()))
		          .findFirst();

		        if (opPath.isPresent()){
		            return opPath.get();
		        }
		    }

		    return null;
	}
	
	//Exercice 2.c???
	public class PrefixFilter implements DirectoryStream.Filter<Path>{
		static Path p;
		long n=8;
		
		@Override
		public boolean accept(Path entry) throws IOException {
			// TODO Auto-generated method stub
			if (Files.isReadable(entry) == true && Files.isDirectory(entry) == true) {
				this.p = entry;
				HashMap <Path,Long> map=new HashMap<>();
//				map.keySet()=Files.walk(this.p)
//					      .filter(p -> p.toFile().isFile())
//					      .mapToLong(p -> p.toFile().length());
				
				return true;
			} else {
				throw new FileNotFoundException();
				
			}
		}
		
	}
}
