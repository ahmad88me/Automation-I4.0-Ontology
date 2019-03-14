package aI40minontology;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Standard <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */

public interface Standard extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDomain
     */
     
    /**
     * Gets all property values for the hasDomain property.<p>
     * 
     * @returns a collection of values for the hasDomain property.
     */
    Collection<? extends Domain> getHasDomain();

    /**
     * Checks if the class has a hasDomain property value.<p>
     * 
     * @return true if there is a hasDomain property value.
     */
    boolean hasHasDomain();

    /**
     * Adds a hasDomain property value.<p>
     * 
     * @param newHasDomain the hasDomain property value to be added
     */
    void addHasDomain(Domain newHasDomain);

    /**
     * Removes a hasDomain property value.<p>
     * 
     * @param oldHasDomain the hasDomain property value to be removed.
     */
    void removeHasDomain(Domain oldHasDomain);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#standardizes
     */
     
    /**
     * Gets all property values for the standardizes property.<p>
     * 
     * @returns a collection of values for the standardizes property.
     */
    Collection<? extends WrappedIndividual> getStandardizes();

    /**
     * Checks if the class has a standardizes property value.<p>
     * 
     * @return true if there is a standardizes property value.
     */
    boolean hasStandardizes();

    /**
     * Adds a standardizes property value.<p>
     * 
     * @param newStandardizes the standardizes property value to be added
     */
    void addStandardizes(WrappedIndividual newStandardizes);

    /**
     * Removes a standardizes property value.<p>
     * 
     * @param oldStandardizes the standardizes property value to be removed.
     */
    void removeStandardizes(WrappedIndividual oldStandardizes);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#concernsTo
     */
     
    /**
     * Gets all property values for the concernsTo property.<p>
     * 
     * @returns a collection of values for the concernsTo property.
     */
    Collection<? extends String> getConcernsTo();

    /**
     * Checks if the class has a concernsTo property value.<p>
     * 
     * @return true if there is a concernsTo property value.
     */
    boolean hasConcernsTo();

    /**
     * Adds a concernsTo property value.<p>
     * 
     * @param newConcernsTo the concernsTo property value to be added
     */
    void addConcernsTo(String newConcernsTo);

    /**
     * Removes a concernsTo property value.<p>
     * 
     * @param oldConcernsTo the concernsTo property value to be removed.
     */
    void removeConcernsTo(String oldConcernsTo);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDBpediaResource
     */
     
    /**
     * Gets all property values for the hasDBpediaResource property.<p>
     * 
     * @returns a collection of values for the hasDBpediaResource property.
     */
    Collection<? extends Object> getHasDBpediaResource();

    /**
     * Checks if the class has a hasDBpediaResource property value.<p>
     * 
     * @return true if there is a hasDBpediaResource property value.
     */
    boolean hasHasDBpediaResource();

    /**
     * Adds a hasDBpediaResource property value.<p>
     * 
     * @param newHasDBpediaResource the hasDBpediaResource property value to be added
     */
    void addHasDBpediaResource(Object newHasDBpediaResource);

    /**
     * Removes a hasDBpediaResource property value.<p>
     * 
     * @param oldHasDBpediaResource the hasDBpediaResource property value to be removed.
     */
    void removeHasDBpediaResource(Object oldHasDBpediaResource);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasEmbeddingCapability
     */
     
    /**
     * Gets all property values for the hasEmbeddingCapability property.<p>
     * 
     * @returns a collection of values for the hasEmbeddingCapability property.
     */
    Collection<? extends String> getHasEmbeddingCapability();

    /**
     * Checks if the class has a hasEmbeddingCapability property value.<p>
     * 
     * @return true if there is a hasEmbeddingCapability property value.
     */
    boolean hasHasEmbeddingCapability();

    /**
     * Adds a hasEmbeddingCapability property value.<p>
     * 
     * @param newHasEmbeddingCapability the hasEmbeddingCapability property value to be added
     */
    void addHasEmbeddingCapability(String newHasEmbeddingCapability);

    /**
     * Removes a hasEmbeddingCapability property value.<p>
     * 
     * @param oldHasEmbeddingCapability the hasEmbeddingCapability property value to be removed.
     */
    void removeHasEmbeddingCapability(String oldHasEmbeddingCapability);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasOfficialResource
     */
     
    /**
     * Gets all property values for the hasOfficialResource property.<p>
     * 
     * @returns a collection of values for the hasOfficialResource property.
     */
    Collection<? extends Object> getHasOfficialResource();

    /**
     * Checks if the class has a hasOfficialResource property value.<p>
     * 
     * @return true if there is a hasOfficialResource property value.
     */
    boolean hasHasOfficialResource();

    /**
     * Adds a hasOfficialResource property value.<p>
     * 
     * @param newHasOfficialResource the hasOfficialResource property value to be added
     */
    void addHasOfficialResource(Object newHasOfficialResource);

    /**
     * Removes a hasOfficialResource property value.<p>
     * 
     * @param oldHasOfficialResource the hasOfficialResource property value to be removed.
     */
    void removeHasOfficialResource(Object oldHasOfficialResource);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasSoftwareContent
     */
     
    /**
     * Gets all property values for the hasSoftwareContent property.<p>
     * 
     * @returns a collection of values for the hasSoftwareContent property.
     */
    Collection<? extends String> getHasSoftwareContent();

    /**
     * Checks if the class has a hasSoftwareContent property value.<p>
     * 
     * @return true if there is a hasSoftwareContent property value.
     */
    boolean hasHasSoftwareContent();

    /**
     * Adds a hasSoftwareContent property value.<p>
     * 
     * @param newHasSoftwareContent the hasSoftwareContent property value to be added
     */
    void addHasSoftwareContent(String newHasSoftwareContent);

    /**
     * Removes a hasSoftwareContent property value.<p>
     * 
     * @param oldHasSoftwareContent the hasSoftwareContent property value to be removed.
     */
    void removeHasSoftwareContent(String oldHasSoftwareContent);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#isContextStandard
     */
     
    /**
     * Gets all property values for the isContextStandard property.<p>
     * 
     * @returns a collection of values for the isContextStandard property.
     */
    Collection<? extends Boolean> getIsContextStandard();

    /**
     * Checks if the class has a isContextStandard property value.<p>
     * 
     * @return true if there is a isContextStandard property value.
     */
    boolean hasIsContextStandard();

    /**
     * Adds a isContextStandard property value.<p>
     * 
     * @param newIsContextStandard the isContextStandard property value to be added
     */
    void addIsContextStandard(Boolean newIsContextStandard);

    /**
     * Removes a isContextStandard property value.<p>
     * 
     * @param oldIsContextStandard the isContextStandard property value to be removed.
     */
    void removeIsContextStandard(Boolean oldIsContextStandard);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
