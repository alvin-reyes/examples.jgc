package com.sample.jgc.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExampleSymbolicLink {

	public ExampleSymbolicLink() {
		Path newLink = new File("link1").toPath();
		Path target = new File("<target_path>").toPath();
		try {
		    Files.createSymbolicLink(newLink, target);
		} catch (IOException x) {
		    System.err.println(x);
		} catch (UnsupportedOperationException x) {
		    // Some file systems do not support symbolic links.
		    System.err.println(x);
		}
	} 
	public static void main(String[] args) {
		new ExampleSymbolicLink();
	}
	
}
