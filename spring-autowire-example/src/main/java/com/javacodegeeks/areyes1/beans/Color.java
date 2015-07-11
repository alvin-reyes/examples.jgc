package com.javacodegeeks.areyes1.beans;

public class Color {
	
	private String baseColor;
	
	private String textureColor;
	
	public String getBaseColor() {
		return baseColor;
	}

	public void setBaseColor(String baseColor) {
		this.baseColor = baseColor;
	}

	public String getTextureColor() {
		return textureColor;
	}

	public void setTextureColor(String textureColor) {
		this.textureColor = textureColor;
	}

	@Override
	public String toString() {
		return baseColor + " base skin color and " + textureColor + " texture color." ;
		
	}
}
