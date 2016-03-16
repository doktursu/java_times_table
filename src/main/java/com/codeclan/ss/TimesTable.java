package com.codeclan.ss;

/**
 * Hello world!
 *
 */
public class TimesTable 
{
	private int width;
	private int height;
	private int greatestIntLength;
	private int[][] tableArray;
	private String tableString;
	
    public TimesTable(int width, int height) {
    	this.width = width;
    	this.height = height;
    	generateTimesTable();
    }
    
    private void generateTimesTable() {
    	generateTableArray();
    	setGreatestIntLength();
    	generateTableStringWithLabels();
    }
    
    private void generateTableArray() {
    	tableArray = new int[width][height];
    	for (int j = 0; j < height; j++) {
    		for (int i = 0; i < width; i++) {
    			tableArray[i][j] = (i+1) * (j+1);
    		}
    	}
    }
    
    private void setGreatestIntLength() {
    	int greatestInt = tableArray[width-1][height-1];
    	greatestIntLength = String.valueOf(greatestInt).length();
    }
    
    private void generateTableString() {
    	StringBuffer str = new StringBuffer();
    	for (int j = 0; j < height; j++) {
    		for (int i = 0; i < width; i++) {
    			str.append(formatNumber(tableArray[i][j]));
    			if (i != width - 1) {
    				str.append(" ");
    			}
    		}
    		str.append("\n");
    	}
    	tableString =  str.toString();
    }
    
    private void generateTableStringWithLabels() {
    	StringBuffer str = new StringBuffer();
    	for (int j = 0; j <= height; j++) {
    		for (int i = 0; i <= width; i++) {
    			if (j == 0) {
    				if (i == 0) {
    					for (int space = 0; space < greatestIntLength; space++) {
    						str.append(" ");
    					}
    				} else {
    					str.append(formatNumber(i));
    				}
    			} else if (i == 0) {
    				str.append(formatNumber(j));
    			} else {
    				str.append(formatNumber(tableArray[i-1][j-1]));
    			}
    			if (i != width) {
    				str.append(" ");
    			}
    		}
    		str.append("\n");
    	}
    	tableString =  str.toString();
    }
    
    private String formatNumber(int number) {
    	StringBuffer str = new StringBuffer();
    	str.append(String.valueOf(number));
    	int numberOfSpaces = greatestIntLength - str.length();
    	for (int i = 0; i < numberOfSpaces; i++) {
    		str.insert(0, " ");
    	}
    	return str.toString();
    }
    
    @Override
    public String toString() {
    	return tableString;
    }
   
}
