package br.com.oqueacho

class Product {

	Long id
	String name
	String brand
	String photo
	boolean enabled
	Category category
	
    static constraints = {
		name(blank: false)
		brand(blank: true, nullable: true)
		photo(blank: true, nullable: true)
		category(nullable: true)
    }
}
