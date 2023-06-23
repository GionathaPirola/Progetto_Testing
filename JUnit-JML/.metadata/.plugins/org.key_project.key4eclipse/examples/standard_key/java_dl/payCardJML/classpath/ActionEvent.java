// This file is part of KeY - Integrated Deductive Software Design 
//
// Copyright (C) 2001-2011 Universitaet Karlsruhe (TH), Germany 
//                         Universitaet Koblenz-Landau, Germany
//                         Chalmers University of Technology, Sweden
// Copyright (C) 2011-2013 Karlsruhe Institute of Technology, Germany 
//                         Technical University Darmstadt, Germany
//                         Chalmers University of Technology, Sweden
//
// The KeY system is protected by the GNU General 
// Public License. See LICENSE.TXT for details.
// 

/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed May 14 11:55:39 CEST 2008
 */
package java.awt.event;

public class ActionEvent extends java.awt.AWTEvent
{
   public final static int SHIFT_MASK = 1;
   public final static int CTRL_MASK = 2;
   public final static int META_MASK = 4;
   public final static int ALT_MASK = 8;
   public final static int ACTION_FIRST = 1001;
   public final static int ACTION_LAST = 1001;
   public final static int ACTION_PERFORMED = 1001;

   public ActionEvent(java.lang.Object arg0, int arg1, java.lang.String arg2);
   public ActionEvent(java.lang.Object arg0, int arg1, java.lang.String arg2, int arg3);
   public ActionEvent(java.lang.Object arg0, int arg1, java.lang.String arg2, long arg3, int arg4);
   public java.lang.String getActionCommand();
   public long getWhen();
   public int getModifiers();
   public java.lang.String paramString();
}
