package com.sai.core.java.builder;

public final class ProductBuilder {

	private final String name;
	private final String description;
	
	private ProductBuilder(Builder builder) {
		
			this.name=builder.name;
			this.description=builder.description;
	}

	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}

	public static Builder builder() {
		
		return new Builder();
	}
	
	public static class Builder{
		
		private String name;
		private String description;
		
		public Builder name(String name) {
			
			this.name=name;
			return this;
		}
		
		public Builder description(String description) {
			
			this.description=description;
			return this;
		} 
		
		
		public ProductBuilder build() {
			
			return new ProductBuilder(this);
		}
		
		
	}
	
}
