/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
    L. S�nchez (luciano@uniovi.es)
    J. Alcal�-Fdez (jalcala@decsai.ugr.es)
    S. Garc�a (sglopez@ujaen.es)
    A. Fern�ndez (alberto.fernandez@ujaen.es)
    J. Luengo (julianlm@decsai.ugr.es)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see http://www.gnu.org/licenses/
  
**********************************************************************/

/* Generated By:JavaCC: Do not edit this line. DataParserConstants.java */
package keel.Algorithms.Rule_Learning.Swap1;

public interface DataParserConstants {

  int EOF = 0;
  int COM = 6;
  int COM2 = 7;
  int RELATION = 8;
  int ATTRIBUTE = 9;
  int INPUTS = 10;
  int OUTPUTS = 11;
  int DATA = 12;
  int INTEG = 13;
  int REAL = 14;
  int EXP = 15;
  int COPENED = 16;
  int CCLOSED = 17;
  int CLOPENED = 18;
  int CLCLOSED = 19;
  int COLON = 20;
  int SCOLON = 21;
  int NULL = 22;
  int INT_CONST = 23;
  int BOOLEAN_CONST = 24;
  int REAL_CONST = 25;
  int CAD_CONST = 26;
  int IDENT = 27;
  int DIGIT = 28;
  int LETTER = 29;
  int ERR_LEX = 30;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\b\"",
    "\"\\n\"",
    "\"\\r\"",
    "<COM>",
    "<COM2>",
    "\"@relation\"",
    "\"@attribute\"",
    "\"@inputs\"",
    "\"@outputs\"",
    "\"@data\"",
    "\"integer\"",
    "\"real\"",
    "<EXP>",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\",\"",
    "\";\"",
    "<NULL>",
    "<INT_CONST>",
    "<BOOLEAN_CONST>",
    "<REAL_CONST>",
    "<CAD_CONST>",
    "<IDENT>",
    "<DIGIT>",
    "<LETTER>",
    "<ERR_LEX>",
  };

}

