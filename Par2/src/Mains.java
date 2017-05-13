
public class Mains {

	public static void main(String[] args) {
		Para<String,Double> p1=new Para<String,Double>("Clara",8.0);
		Para<Integer,String>p2= new Para<Integer,String>(9,"Laura");
		Para<Float,Float>p3 = new Para<Float,Float>( new Float(0.5),new Float(0.8788));
		System.out.println("Print  isso  ai " + p1.toString()+p2.toString()+p3.toString());
	}
	}


