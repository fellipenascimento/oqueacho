package br.com.oqueacho

class Category {

	Long id
	String name
	
	static belongsTo = Product
	
    static constraints = {
		name(blank: false)
    }
	
	def toString = {
		name
	}
}
