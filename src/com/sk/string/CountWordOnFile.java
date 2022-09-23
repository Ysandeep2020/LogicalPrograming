package com.sk.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class CountWordOnFile {

	public static void main(String[] args) throws FileNotFoundException {
		// count words into files
		String line;
		int count = 0;
		FileReader reader = new FileReader(
				new File("F:\\spring\\tools\\LogicalPrograming\\bin\\com\\sk\\string\\Ram.txt"));
		BufferedReader br = new BufferedReader(reader);

		while ((line = String.valueOf(br.lines())) != null) {
			String[] words = line.split("");
			count += words.length;
		}

		System.out.println(count);
	}
}
