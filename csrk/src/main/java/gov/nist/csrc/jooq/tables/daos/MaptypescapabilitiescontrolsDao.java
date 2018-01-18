/*
 * This file is generated by jOOQ.
*/
package gov.nist.csrc.jooq.tables.daos;


import gov.nist.csrc.jooq.tables.Maptypescapabilitiescontrols;
import gov.nist.csrc.jooq.tables.records.MaptypescapabilitiescontrolsRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MaptypescapabilitiescontrolsDao extends DAOImpl<MaptypescapabilitiescontrolsRecord, gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols, Integer> {

    /**
     * Create a new MaptypescapabilitiescontrolsDao without any configuration
     */
    public MaptypescapabilitiescontrolsDao() {
        super(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS, gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols.class);
    }

    /**
     * Create a new MaptypescapabilitiescontrolsDao with an attached configuration
     */
    public MaptypescapabilitiescontrolsDao(Configuration configuration) {
        super(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS, gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>Id IN (values)</code>
     */
    public List<gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols> fetchById(Integer... values) {
        return fetch(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>Id = value</code>
     */
    public gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols fetchOneById(Integer value) {
        return fetchOne(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS.ID, value);
    }

    /**
     * Fetch records that have <code>CapabilitiesId IN (values)</code>
     */
    public List<gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols> fetchByCapabilitiesid(Integer... values) {
        return fetch(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS.CAPABILITIESID, values);
    }

    /**
     * Fetch records that have <code>ControlsId IN (values)</code>
     */
    public List<gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols> fetchByControlsid(Integer... values) {
        return fetch(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS.CONTROLSID, values);
    }

    /**
     * Fetch records that have <code>MapTypesId IN (values)</code>
     */
    public List<gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols> fetchByMaptypesid(Integer... values) {
        return fetch(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS.MAPTYPESID, values);
    }

    /**
     * Fetch records that have <code>SpecsId IN (values)</code>
     */
    public List<gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols> fetchBySpecsid(Integer... values) {
        return fetch(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS.SPECSID, values);
    }

    /**
     * Fetch records that have <code>IsControlMap IN (values)</code>
     */
    public List<gov.nist.csrc.jooq.tables.pojos.Maptypescapabilitiescontrols> fetchByIscontrolmap(Boolean... values) {
        return fetch(Maptypescapabilitiescontrols.MAPTYPESCAPABILITIESCONTROLS.ISCONTROLMAP, values);
    }
}