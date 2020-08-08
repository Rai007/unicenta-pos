//    KrOS POS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2018 uniCenta
//    https://unicenta.com
//
//    This file is part of KrOS POS
//
//    KrOS POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   KrOS POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with KrOS POS.  If not, see <http://www.gnu.org/licenses/>.


package com.openbravo.pos.payment;

/**
 *
 * @author adrian
 */
public interface JPaymentNotifier {
    
//    public void setOKEnabled(boolean bValue);
//    public void setAddEnabled(boolean bValue);

    /**
     *
     * @param isPositive
     * @param isComplete
     */
        public void setStatus(boolean isPositive, boolean isComplete);
}
