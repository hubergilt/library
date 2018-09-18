package library

class Author {

	String name
	String dni
    static constraints = {
    	name blank: false, size: 5..150
    	dni blank: false, size: 8
    }
    String toString(){
    	name
    }
}
