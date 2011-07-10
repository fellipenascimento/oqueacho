import br.com.oqueacho.Category

class BootStrap {

    def init = { servletContext ->
		Category.findByName('informatica')?: new Category(name: 'informatica').save()
    }
    def destroy = {
    }
}
