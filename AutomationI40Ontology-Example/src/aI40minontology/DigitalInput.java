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
 * Source Class: DigitalInput <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */

public interface DigitalInput extends Input, DigitalVariable {

    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSequence
     */
     
    /**
     * Gets all property values for the belongsToSequence property.<p>
     * 
     * @returns a collection of values for the belongsToSequence property.
     */
    Collection<? extends Sequence> getBelongsToSequence();

    /**
     * Checks if the class has a belongsToSequence property value.<p>
     * 
     * @return true if there is a belongsToSequence property value.
     */
    boolean hasBelongsToSequence();

    /**
     * Adds a belongsToSequence property value.<p>
     * 
     * @param newBelongsToSequence the belongsToSequence property value to be added
     */
    void addBelongsToSequence(Sequence newBelongsToSequence);

    /**
     * Removes a belongsToSequence property value.<p>
     * 
     * @param oldBelongsToSequence the belongsToSequence property value to be removed.
     */
    void removeBelongsToSequence(Sequence oldBelongsToSequence);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSubsequence
     */
     
    /**
     * Gets all property values for the belongsToSubsequence property.<p>
     * 
     * @returns a collection of values for the belongsToSubsequence property.
     */
    Collection<? extends Subsequence> getBelongsToSubsequence();

    /**
     * Checks if the class has a belongsToSubsequence property value.<p>
     * 
     * @return true if there is a belongsToSubsequence property value.
     */
    boolean hasBelongsToSubsequence();

    /**
     * Adds a belongsToSubsequence property value.<p>
     * 
     * @param newBelongsToSubsequence the belongsToSubsequence property value to be added
     */
    void addBelongsToSubsequence(Subsequence newBelongsToSubsequence);

    /**
     * Removes a belongsToSubsequence property value.<p>
     * 
     * @param oldBelongsToSubsequence the belongsToSubsequence property value to be removed.
     */
    void removeBelongsToSubsequence(Subsequence oldBelongsToSubsequence);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#isConnectedToArc
     */
     
    /**
     * Gets all property values for the isConnectedToArc property.<p>
     * 
     * @returns a collection of values for the isConnectedToArc property.
     */
    Collection<? extends Arc> getIsConnectedToArc();

    /**
     * Checks if the class has a isConnectedToArc property value.<p>
     * 
     * @return true if there is a isConnectedToArc property value.
     */
    boolean hasIsConnectedToArc();

    /**
     * Adds a isConnectedToArc property value.<p>
     * 
     * @param newIsConnectedToArc the isConnectedToArc property value to be added
     */
    void addIsConnectedToArc(Arc newIsConnectedToArc);

    /**
     * Removes a isConnectedToArc property value.<p>
     * 
     * @param oldIsConnectedToArc the isConnectedToArc property value to be removed.
     */
    void removeIsConnectedToArc(Arc oldIsConnectedToArc);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#isContextVariableOf
     */
     
    /**
     * Gets all property values for the isContextVariableOf property.<p>
     * 
     * @returns a collection of values for the isContextVariableOf property.
     */
    Collection<? extends DataStream> getIsContextVariableOf();

    /**
     * Checks if the class has a isContextVariableOf property value.<p>
     * 
     * @return true if there is a isContextVariableOf property value.
     */
    boolean hasIsContextVariableOf();

    /**
     * Adds a isContextVariableOf property value.<p>
     * 
     * @param newIsContextVariableOf the isContextVariableOf property value to be added
     */
    void addIsContextVariableOf(DataStream newIsContextVariableOf);

    /**
     * Removes a isContextVariableOf property value.<p>
     * 
     * @param oldIsContextVariableOf the isContextVariableOf property value to be removed.
     */
    void removeIsContextVariableOf(DataStream oldIsContextVariableOf);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#readsAbout
     */
     
    /**
     * Gets all property values for the readsAbout property.<p>
     * 
     * @returns a collection of values for the readsAbout property.
     */
    Collection<? extends Entity> getReadsAbout();

    /**
     * Checks if the class has a readsAbout property value.<p>
     * 
     * @return true if there is a readsAbout property value.
     */
    boolean hasReadsAbout();

    /**
     * Adds a readsAbout property value.<p>
     * 
     * @param newReadsAbout the readsAbout property value to be added
     */
    void addReadsAbout(Entity newReadsAbout);

    /**
     * Removes a readsAbout property value.<p>
     * 
     * @param oldReadsAbout the readsAbout property value to be removed.
     */
    void removeReadsAbout(Entity oldReadsAbout);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDataType
     */
     
    /**
     * Gets all property values for the hasDataType property.<p>
     * 
     * @returns a collection of values for the hasDataType property.
     */
    Collection<? extends String> getHasDataType();

    /**
     * Checks if the class has a hasDataType property value.<p>
     * 
     * @return true if there is a hasDataType property value.
     */
    boolean hasHasDataType();

    /**
     * Adds a hasDataType property value.<p>
     * 
     * @param newHasDataType the hasDataType property value to be added
     */
    void addHasDataType(String newHasDataType);

    /**
     * Removes a hasDataType property value.<p>
     * 
     * @param oldHasDataType the hasDataType property value to be removed.
     */
    void removeHasDataType(String oldHasDataType);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDescription
     */
     
    /**
     * Gets all property values for the hasDescription property.<p>
     * 
     * @returns a collection of values for the hasDescription property.
     */
    Collection<? extends String> getHasDescription();

    /**
     * Checks if the class has a hasDescription property value.<p>
     * 
     * @return true if there is a hasDescription property value.
     */
    boolean hasHasDescription();

    /**
     * Adds a hasDescription property value.<p>
     * 
     * @param newHasDescription the hasDescription property value to be added
     */
    void addHasDescription(String newHasDescription);

    /**
     * Removes a hasDescription property value.<p>
     * 
     * @param oldHasDescription the hasDescription property value to be removed.
     */
    void removeHasDescription(String oldHasDescription);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasIdentifier
     */
     
    /**
     * Gets all property values for the hasIdentifier property.<p>
     * 
     * @returns a collection of values for the hasIdentifier property.
     */
    Collection<? extends Integer> getHasIdentifier();

    /**
     * Checks if the class has a hasIdentifier property value.<p>
     * 
     * @return true if there is a hasIdentifier property value.
     */
    boolean hasHasIdentifier();

    /**
     * Adds a hasIdentifier property value.<p>
     * 
     * @param newHasIdentifier the hasIdentifier property value to be added
     */
    void addHasIdentifier(Integer newHasIdentifier);

    /**
     * Removes a hasIdentifier property value.<p>
     * 
     * @param oldHasIdentifier the hasIdentifier property value to be removed.
     */
    void removeHasIdentifier(Integer oldHasIdentifier);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfTasks
     */
     
    /**
     * Gets all property values for the hasNumberOfTasks property.<p>
     * 
     * @returns a collection of values for the hasNumberOfTasks property.
     */
    Collection<? extends Integer> getHasNumberOfTasks();

    /**
     * Checks if the class has a hasNumberOfTasks property value.<p>
     * 
     * @return true if there is a hasNumberOfTasks property value.
     */
    boolean hasHasNumberOfTasks();

    /**
     * Adds a hasNumberOfTasks property value.<p>
     * 
     * @param newHasNumberOfTasks the hasNumberOfTasks property value to be added
     */
    void addHasNumberOfTasks(Integer newHasNumberOfTasks);

    /**
     * Removes a hasNumberOfTasks property value.<p>
     * 
     * @param oldHasNumberOfTasks the hasNumberOfTasks property value to be removed.
     */
    void removeHasNumberOfTasks(Integer oldHasNumberOfTasks);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasValue
     */
     
    /**
     * Gets all property values for the hasValue property.<p>
     * 
     * @returns a collection of values for the hasValue property.
     */
    Collection<? extends Object> getHasValue();

    /**
     * Checks if the class has a hasValue property value.<p>
     * 
     * @return true if there is a hasValue property value.
     */
    boolean hasHasValue();

    /**
     * Adds a hasValue property value.<p>
     * 
     * @param newHasValue the hasValue property value to be added
     */
    void addHasValue(Object newHasValue);

    /**
     * Removes a hasValue property value.<p>
     * 
     * @param oldHasValue the hasValue property value to be removed.
     */
    void removeHasValue(Object oldHasValue);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
