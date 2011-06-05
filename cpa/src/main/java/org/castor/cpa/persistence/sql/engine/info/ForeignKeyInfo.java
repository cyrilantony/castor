/*
 * Copyright 2011 Ralf Joachim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id: TableInfo.java 8469 2009-12-28 16:47:54Z rjoachim $
 */
package org.castor.cpa.persistence.sql.engine.info;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a foreign key from one table to another.
 *
 * @author <a href="mailto:ralf DOT joachim AT syscon DOT eu">Ralf Joachim</a>
 * @version $Revision: 8469 $ $Date: 2006-04-25 15:08:23 -0600 (Tue, 25 Apr 2006) $
 */
public final class ForeignKeyInfo {
    //-----------------------------------------------------------------------------------    

    /** Index of the field in array of field values. This does not correspond to fields in
     *  mapping as transient fields ignored and are not counted here. */
    private final int _fieldIndex;

    /** Table that holds the foreign key. */
    private final TableInfo _fromTable;

    /** List of columns of the foreign key. */
    private final List<ColumnInfo> _fromColumns = new ArrayList<ColumnInfo>();

    /** Table referenced by the foreign key. */
    private final EntityTableInfo _toTable;

    /** Alias of the table referenced by the foreign key. */
    private final String _toAlias;
    
    //-----------------------------------------------------------------------------------    

    /**
     * Construct a foreign key.
     * 
     * @param fieldIndex Index of the field in array of field values.
     * @param fromTable Table that holds the foreign key.
     * @param toTable Table referenced by the foreign key.
     * @param toAlias Alias of the table referenced by the foreign key.
     */
    protected ForeignKeyInfo(final int fieldIndex, final TableInfo fromTable,
            final EntityTableInfo toTable, final String toAlias) {
        _fieldIndex = fieldIndex;
        _fromTable = fromTable;
        _toTable = toTable;
        _toAlias = toAlias;
    }

    //-----------------------------------------------------------------------------------
    
    /**
     * Add from column.
     * 
     * @param column Column to add to from columns.
     */
    protected void addFromColumn(final ColumnInfo column) {
        _fromColumns.add(column);
    }
    
    //-----------------------------------------------------------------------------------    

    /**
     * Get index of the field in array of field values. This does not correspond to fields in
     * mapping as transient fields ignored and are not counted here.
     * 
     * @return Index of the field in array of field values.
     */
    public int getFieldIndex() { return _fieldIndex; }
    
    /**
     * Method returning the table that holds the foreign key.
     * 
     * @return Table that holds the foreign key.
     */
    public TableInfo getFromTable() { return _fromTable; }

    /**
     * Method returning list of columns of the foreign key.
     * 
     * @return List of columns of the foreign key
     */
    public List<ColumnInfo> getFromColumns() { return _fromColumns; }

    /**
     * Method returning the table referenced by the foreign key.
     * 
     * @return Table referenced by the foreign key.
     */
    public EntityTableInfo getToTable() { return _toTable; }

    /**
     * Method returning the alias of the table referenced by the foreign key.
     * 
     * @return Alias of the table referenced by the foreign key.
     */
    public String getToAlias() { return _toAlias; }

    //-----------------------------------------------------------------------------------    
}