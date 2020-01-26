/*
 * Exo_Perimetre.java
 * 
 * Copyright 2019 Valentin VERSTRACTE <vv224843@GR18-08>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Exo_Perimetre {
	
	public static void main (String[] args) {
		double a,b,c,P;
		System.out.println("donner la valeur d'un coté:");a=Lire.i();
		System.out.println("Donner la valeur de l'autre coté:");c=Lire.d();
		b=Math.sqrt((c*c)-(a*a));
		P=a+b+c;
		System.out.println("Le périmètre est:"+P);
		
	}
}

