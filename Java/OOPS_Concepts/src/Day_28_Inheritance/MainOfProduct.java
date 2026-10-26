package Day_28_Inheritance;

public class MainOfProduct {

	public static void main(String[] args) {
		ClothingProduct cloth = new ClothingProduct("Jeans","Baggy Fit 4 pocket", 50, "InStock","Levi's","Denim" ,10);
        cloth.showCloth();
        ElectronicProduct electricProduct = new ElectronicProduct("Ac","Dual-Compressor",10,"In-Stock", true , 3);
        electricProduct.showElectronicProduct();
        
        
	
	}

}

