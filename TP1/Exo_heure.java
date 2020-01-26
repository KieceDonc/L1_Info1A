/*
 * Exo_heure.java
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


public class Exo_heure {
	
	public static void main (String[] args) {
		int S,h,m,r,s;
		System.out.println("Entrer le nombre seconde:");S=Lire.i();
		h=S/3600;
		r=S%3600;
		m=r/60;
		s=r%60;
		System.out.println(S+"= "+h+"heure(s) "+m+"min "+s+"sec");
	}
}

