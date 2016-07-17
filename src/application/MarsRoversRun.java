package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import business.Plateau;

public class MarsRoversRun {

	public static void main(String[] args) {
		int lineNr = 0;
		String fileName = args[1];
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(fileName));
			
			// Create Plateau
			lineNr++;
			String plateauInput = reader.readLine();
			String[] tokens = plateauInput.split(" ");
			if(tokens.length != 2) throw new IOException(
					"Error reading plateau parameters! Line " + lineNr);
			
			String xStr = tokens[0];
			int xSize = Integer.parseInt(xStr);
			
			String yStr = tokens[1];
			int ySize = Integer.parseInt(yStr);
			
			Plateau plateau = new Plateau(xSize, ySize);
			
			// Create rover
			String line = new String();
			lineNr++;
			while ((line = reader.readLine()) != null) {
				tokens = line.split(" ");
				if(tokens.length != 3) throw new IOException(
						"Error reading rover parameters! Line " + lineNr);
				String xPositionStr = tokens[0];
				String yPostiionStr = tokens[1];
				String directionStr = tokens[3];
				
				// TODO Create rover
				
				line = reader.readLine();
				lineNr++;
				
				// TODO Read rover moves
				
				// TODO Print rover final position
			}
			
			
			
			reader.close();
		}catch (NumberFormatException e) {
			System.out.println("Error reading number from file!");
		} 
		catch (IOException e) {
			System.out.println("IO Error: " + fileName + " Lines read: " + lineNr);
		} 
		
		
		

		
		// TODO Read rover data
		// TODO Read rover moves

	}

}
