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
 * Date: Wed May 14 11:55:36 CEST 2008
 */
package javax.swing;

public class ButtonGroup extends java.lang.Object implements java.io.Serializable
{
   protected java.util.Vector buttons;

   public ButtonGroup();
   public void add(javax.swing.AbstractButton arg0);
   public void remove(javax.swing.AbstractButton arg0);
   public void clearSelection();
   public java.util.Enumeration getElements();
   public javax.swing.ButtonModel getSelection();
   public void setSelected(javax.swing.ButtonModel arg0, boolean arg1);
   public boolean isSelected(javax.swing.ButtonModel arg0);
   public int getButtonCount();
}
