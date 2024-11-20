public class TestTV {
	    public static void main(String[] args) {
        Marca samsung = new Marca("Samsung");
        TV tv1 = new TV(samsung, false);

        System.out.println(tv1.getMarca().getNombre()); 
        tv1.turnOn();
        tv1.setCanal(50);
        System.out.println(tv1.getCanal()); 
        tv1.canalUp();
        System.out.println(tv1.getCanal()); 

        Control control = new Control();
        control.enlazar(tv1);
        control.setCanal(10);
        System.out.println(tv1.getCanal()); 
    }
}
