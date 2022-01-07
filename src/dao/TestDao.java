package dao;

import java.util.List;

import metier.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImp pdao= new ProduitDaoImp();
		Produit prod= pdao.getProduit(2L);
		System.out.println(prod);
		prod.setNomProduit("toto");
		pdao.updateProduit(prod);
		System.out.println("after update " +prod);
		
		
	}

}