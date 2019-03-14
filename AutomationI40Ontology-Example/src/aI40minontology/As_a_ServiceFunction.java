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
 * Source Class: As_a_ServiceFunction <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */

public interface As_a_ServiceFunction extends AdvancedFunction {

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
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#isExecutedBy
     */
     
    /**
     * Gets all property values for the isExecutedBy property.<p>
     * 
     * @returns a collection of values for the isExecutedBy property.
     */
    Collection<? extends Actor> getIsExecutedBy();

    /**
     * Checks if the class has a isExecutedBy property value.<p>
     * 
     * @return true if there is a isExecutedBy property value.
     */
    boolean hasIsExecutedBy();

    /**
     * Adds a isExecutedBy property value.<p>
     * 
     * @param newIsExecutedBy the isExecutedBy property value to be added
     */
    void addIsExecutedBy(Actor newIsExecutedBy);

    /**
     * Removes a isExecutedBy property value.<p>
     * 
     * @param oldIsExecutedBy the isExecutedBy property value to be removed.
     */
    void removeIsExecutedBy(Actor oldIsExecutedBy);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#receivesParameter
     */
     
    /**
     * Gets all property values for the receivesParameter property.<p>
     * 
     * @returns a collection of values for the receivesParameter property.
     */
    Collection<? extends Variable> getReceivesParameter();

    /**
     * Checks if the class has a receivesParameter property value.<p>
     * 
     * @return true if there is a receivesParameter property value.
     */
    boolean hasReceivesParameter();

    /**
     * Adds a receivesParameter property value.<p>
     * 
     * @param newReceivesParameter the receivesParameter property value to be added
     */
    void addReceivesParameter(Variable newReceivesParameter);

    /**
     * Removes a receivesParameter property value.<p>
     * 
     * @param oldReceivesParameter the receivesParameter property value to be removed.
     */
    void removeReceivesParameter(Variable oldReceivesParameter);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#returnsResult
     */
     
    /**
     * Gets all property values for the returnsResult property.<p>
     * 
     * @returns a collection of values for the returnsResult property.
     */
    Collection<? extends Variable> getReturnsResult();

    /**
     * Checks if the class has a returnsResult property value.<p>
     * 
     * @return true if there is a returnsResult property value.
     */
    boolean hasReturnsResult();

    /**
     * Adds a returnsResult property value.<p>
     * 
     * @param newReturnsResult the returnsResult property value to be added
     */
    void addReturnsResult(Variable newReturnsResult);

    /**
     * Removes a returnsResult property value.<p>
     * 
     * @param oldReturnsResult the returnsResult property value to be removed.
     */
    void removeReturnsResult(Variable oldReturnsResult);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#runsAService
     */
     
    /**
     * Gets all property values for the runsAService property.<p>
     * 
     * @returns a collection of values for the runsAService property.
     */
    Collection<? extends Service> getRunsAService();

    /**
     * Checks if the class has a runsAService property value.<p>
     * 
     * @return true if there is a runsAService property value.
     */
    boolean hasRunsAService();

    /**
     * Adds a runsAService property value.<p>
     * 
     * @param newRunsAService the runsAService property value to be added
     */
    void addRunsAService(Service newRunsAService);

    /**
     * Removes a runsAService property value.<p>
     * 
     * @param oldRunsAService the runsAService property value to be removed.
     */
    void removeRunsAService(Service oldRunsAService);


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
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfParameters
     */
     
    /**
     * Gets all property values for the hasNumberOfParameters property.<p>
     * 
     * @returns a collection of values for the hasNumberOfParameters property.
     */
    Collection<? extends Integer> getHasNumberOfParameters();

    /**
     * Checks if the class has a hasNumberOfParameters property value.<p>
     * 
     * @return true if there is a hasNumberOfParameters property value.
     */
    boolean hasHasNumberOfParameters();

    /**
     * Adds a hasNumberOfParameters property value.<p>
     * 
     * @param newHasNumberOfParameters the hasNumberOfParameters property value to be added
     */
    void addHasNumberOfParameters(Integer newHasNumberOfParameters);

    /**
     * Removes a hasNumberOfParameters property value.<p>
     * 
     * @param oldHasNumberOfParameters the hasNumberOfParameters property value to be removed.
     */
    void removeHasNumberOfParameters(Integer oldHasNumberOfParameters);



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
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasReturnDataType
     */
     
    /**
     * Gets all property values for the hasReturnDataType property.<p>
     * 
     * @returns a collection of values for the hasReturnDataType property.
     */
    Collection<? extends String> getHasReturnDataType();

    /**
     * Checks if the class has a hasReturnDataType property value.<p>
     * 
     * @return true if there is a hasReturnDataType property value.
     */
    boolean hasHasReturnDataType();

    /**
     * Adds a hasReturnDataType property value.<p>
     * 
     * @param newHasReturnDataType the hasReturnDataType property value to be added
     */
    void addHasReturnDataType(String newHasReturnDataType);

    /**
     * Removes a hasReturnDataType property value.<p>
     * 
     * @param oldHasReturnDataType the hasReturnDataType property value to be removed.
     */
    void removeHasReturnDataType(String oldHasReturnDataType);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasReturnValue
     */
     
    /**
     * Gets all property values for the hasReturnValue property.<p>
     * 
     * @returns a collection of values for the hasReturnValue property.
     */
    Collection<? extends Object> getHasReturnValue();

    /**
     * Checks if the class has a hasReturnValue property value.<p>
     * 
     * @return true if there is a hasReturnValue property value.
     */
    boolean hasHasReturnValue();

    /**
     * Adds a hasReturnValue property value.<p>
     * 
     * @param newHasReturnValue the hasReturnValue property value to be added
     */
    void addHasReturnValue(Object newHasReturnValue);

    /**
     * Removes a hasReturnValue property value.<p>
     * 
     * @param oldHasReturnValue the hasReturnValue property value to be removed.
     */
    void removeHasReturnValue(Object oldHasReturnValue);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
