package br.com.oqueacho

import grails.test.*

import br.com.oqueacho.Category
import br.com.oqueacho.Product

class ProductControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
		def c = new Category(id:1, name: 'informatica')
		mockDomain(Category, [c])
		def p = new Product(id:1, name:'cpu intel core2 duo', category:c)
		mockDomain(Product, [p])
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testShowAllAvailable() {
		def products = this.controller.list()
		assertTrue products.size() > 0
    }
	
	void testCreate() {
		controller.params.name = 'DVD'
		controller.params.category = '1'
		controller.save()
		assertEquals "show", controller.redirectArgs['action']
	}
	
	void testShouldNotCreateWhenCategoryNotExists() {
		controller.params.name = 'DVD'
		controller.params.category = '9999'
		controller.save()
		assert controller.renderArgs['model']
	}
}
