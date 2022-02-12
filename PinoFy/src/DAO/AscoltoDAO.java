package DAO;

import java.util.ArrayList;

import Model.*;

public interface AscoltoDAO 
{
	int insertAscolto(String query);
	
	ArrayList<Ascolto> mostraAscolti(String query);
}
