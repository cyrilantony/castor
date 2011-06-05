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

/**
 * Class representing a table for a many to many relation.
 *
 * @author <a href="mailto:ralf DOT joachim AT syscon DOT eu">Ralf Joachim</a>
 * @version $Revision: 8469 $ $Date: 2006-04-25 15:08:23 -0600 (Tue, 25 Apr 2006) $
 */
public final class RelationTableInfo extends TableInfo {
    //-----------------------------------------------------------------------------------    

    /** Foreign key to left side of many to many relation. */
    private ForeignKeyInfo _leftForeignKey;

    /** Foreign key to right side of many to many relation. */
    private ForeignKeyInfo _rightForeignKey;

    //-----------------------------------------------------------------------------------    

    /**
     * Constructor taking tableName in order to construct table that holds his name only.
     * 
     * @param tableName Name of the table to be constructed.
     */
    protected RelationTableInfo(final String tableName) {
        super(tableName);
    }

    //-----------------------------------------------------------------------------------
    
    /**
     * Set foreign key to left side of many to many relation.
     * 
     * @param foreignKey Foreign key to left side of many to many relation.
     */
    protected void setLeftForeignKey(final ForeignKeyInfo foreignKey) {
        _leftForeignKey = foreignKey;
    }
    
    /**
     * Set foreign key to right side of many to many relation.
     * @param foreignKey Foreign key to right side of many to many relation.
     */
    protected void setRightForeignKey(final ForeignKeyInfo foreignKey) {
        _rightForeignKey = foreignKey;
    }
    
    //-----------------------------------------------------------------------------------    

    /**
     * Get foreign key to left side of many to many relation.
     * 
     * @return Foreign key to left side of many to many relation.
     */
    public ForeignKeyInfo getLeftForeignKey() { return _leftForeignKey; }
    
    /**
     * Get foreign key to right side of many to many relation.
     * 
     * @return Foreign key to right side of many to many relation.
     */
    public ForeignKeyInfo getRightForeignKey() { return _rightForeignKey; }
    
    //-----------------------------------------------------------------------------------    
}