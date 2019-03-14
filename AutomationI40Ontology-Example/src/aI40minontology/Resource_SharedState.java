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
 * Source Class: Resource_SharedState <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */

public interface Resource_SharedState extends State {

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
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#finalizesLoop
     */
     
    /**
     * Gets all property values for the finalizesLoop property.<p>
     * 
     * @returns a collection of values for the finalizesLoop property.
     */
    Collection<? extends Loop> getFinalizesLoop();

    /**
     * Checks if the class has a finalizesLoop property value.<p>
     * 
     * @return true if there is a finalizesLoop property value.
     */
    boolean hasFinalizesLoop();

    /**
     * Adds a finalizesLoop property value.<p>
     * 
     * @param newFinalizesLoop the finalizesLoop property value to be added
     */
    void addFinalizesLoop(Loop newFinalizesLoop);

    /**
     * Removes a finalizesLoop property value.<p>
     * 
     * @param oldFinalizesLoop the finalizesLoop property value to be removed.
     */
    void removeFinalizesLoop(Loop oldFinalizesLoop);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#finalizesSubsequence
     */
     
    /**
     * Gets all property values for the finalizesSubsequence property.<p>
     * 
     * @returns a collection of values for the finalizesSubsequence property.
     */
    Collection<? extends Subsequence> getFinalizesSubsequence();

    /**
     * Checks if the class has a finalizesSubsequence property value.<p>
     * 
     * @return true if there is a finalizesSubsequence property value.
     */
    boolean hasFinalizesSubsequence();

    /**
     * Adds a finalizesSubsequence property value.<p>
     * 
     * @param newFinalizesSubsequence the finalizesSubsequence property value to be added
     */
    void addFinalizesSubsequence(Subsequence newFinalizesSubsequence);

    /**
     * Removes a finalizesSubsequence property value.<p>
     * 
     * @param oldFinalizesSubsequence the finalizesSubsequence property value to be removed.
     */
    void removeFinalizesSubsequence(Subsequence oldFinalizesSubsequence);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNextState
     */
     
    /**
     * Gets all property values for the hasNextState property.<p>
     * 
     * @returns a collection of values for the hasNextState property.
     */
    Collection<? extends State> getHasNextState();

    /**
     * Checks if the class has a hasNextState property value.<p>
     * 
     * @return true if there is a hasNextState property value.
     */
    boolean hasHasNextState();

    /**
     * Adds a hasNextState property value.<p>
     * 
     * @param newHasNextState the hasNextState property value to be added
     */
    void addHasNextState(State newHasNextState);

    /**
     * Removes a hasNextState property value.<p>
     * 
     * @param oldHasNextState the hasNextState property value to be removed.
     */
    void removeHasNextState(State oldHasNextState);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasPreviousState
     */
     
    /**
     * Gets all property values for the hasPreviousState property.<p>
     * 
     * @returns a collection of values for the hasPreviousState property.
     */
    Collection<? extends State> getHasPreviousState();

    /**
     * Checks if the class has a hasPreviousState property value.<p>
     * 
     * @return true if there is a hasPreviousState property value.
     */
    boolean hasHasPreviousState();

    /**
     * Adds a hasPreviousState property value.<p>
     * 
     * @param newHasPreviousState the hasPreviousState property value to be added
     */
    void addHasPreviousState(State newHasPreviousState);

    /**
     * Removes a hasPreviousState property value.<p>
     * 
     * @param oldHasPreviousState the hasPreviousState property value to be removed.
     */
    void removeHasPreviousState(State oldHasPreviousState);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasResource
     */
     
    /**
     * Gets all property values for the hasResource property.<p>
     * 
     * @returns a collection of values for the hasResource property.
     */
    Collection<? extends Resource> getHasResource();

    /**
     * Checks if the class has a hasResource property value.<p>
     * 
     * @return true if there is a hasResource property value.
     */
    boolean hasHasResource();

    /**
     * Adds a hasResource property value.<p>
     * 
     * @param newHasResource the hasResource property value to be added
     */
    void addHasResource(Resource newHasResource);

    /**
     * Removes a hasResource property value.<p>
     * 
     * @param oldHasResource the hasResource property value to be removed.
     */
    void removeHasResource(Resource oldHasResource);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasStateFunction
     */
     
    /**
     * Gets all property values for the hasStateFunction property.<p>
     * 
     * @returns a collection of values for the hasStateFunction property.
     */
    Collection<? extends StateFunction> getHasStateFunction();

    /**
     * Checks if the class has a hasStateFunction property value.<p>
     * 
     * @return true if there is a hasStateFunction property value.
     */
    boolean hasHasStateFunction();

    /**
     * Adds a hasStateFunction property value.<p>
     * 
     * @param newHasStateFunction the hasStateFunction property value to be added
     */
    void addHasStateFunction(StateFunction newHasStateFunction);

    /**
     * Removes a hasStateFunction property value.<p>
     * 
     * @param oldHasStateFunction the hasStateFunction property value to be removed.
     */
    void removeHasStateFunction(StateFunction oldHasStateFunction);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#initializesLoop
     */
     
    /**
     * Gets all property values for the initializesLoop property.<p>
     * 
     * @returns a collection of values for the initializesLoop property.
     */
    Collection<? extends Loop> getInitializesLoop();

    /**
     * Checks if the class has a initializesLoop property value.<p>
     * 
     * @return true if there is a initializesLoop property value.
     */
    boolean hasInitializesLoop();

    /**
     * Adds a initializesLoop property value.<p>
     * 
     * @param newInitializesLoop the initializesLoop property value to be added
     */
    void addInitializesLoop(Loop newInitializesLoop);

    /**
     * Removes a initializesLoop property value.<p>
     * 
     * @param oldInitializesLoop the initializesLoop property value to be removed.
     */
    void removeInitializesLoop(Loop oldInitializesLoop);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#initializesSubsequence
     */
     
    /**
     * Gets all property values for the initializesSubsequence property.<p>
     * 
     * @returns a collection of values for the initializesSubsequence property.
     */
    Collection<? extends Subsequence> getInitializesSubsequence();

    /**
     * Checks if the class has a initializesSubsequence property value.<p>
     * 
     * @return true if there is a initializesSubsequence property value.
     */
    boolean hasInitializesSubsequence();

    /**
     * Adds a initializesSubsequence property value.<p>
     * 
     * @param newInitializesSubsequence the initializesSubsequence property value to be added
     */
    void addInitializesSubsequence(Subsequence newInitializesSubsequence);

    /**
     * Removes a initializesSubsequence property value.<p>
     * 
     * @param oldInitializesSubsequence the initializesSubsequence property value to be removed.
     */
    void removeInitializesSubsequence(Subsequence oldInitializesSubsequence);


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
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#isConnectedToTransition
     */
     
    /**
     * Gets all property values for the isConnectedToTransition property.<p>
     * 
     * @returns a collection of values for the isConnectedToTransition property.
     */
    Collection<? extends Transition> getIsConnectedToTransition();

    /**
     * Checks if the class has a isConnectedToTransition property value.<p>
     * 
     * @return true if there is a isConnectedToTransition property value.
     */
    boolean hasIsConnectedToTransition();

    /**
     * Adds a isConnectedToTransition property value.<p>
     * 
     * @param newIsConnectedToTransition the isConnectedToTransition property value to be added
     */
    void addIsConnectedToTransition(Transition newIsConnectedToTransition);

    /**
     * Removes a isConnectedToTransition property value.<p>
     * 
     * @param oldIsConnectedToTransition the isConnectedToTransition property value to be removed.
     */
    void removeIsConnectedToTransition(Transition oldIsConnectedToTransition);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#receivesDataStream
     */
     
    /**
     * Gets all property values for the receivesDataStream property.<p>
     * 
     * @returns a collection of values for the receivesDataStream property.
     */
    Collection<? extends DataStream> getReceivesDataStream();

    /**
     * Checks if the class has a receivesDataStream property value.<p>
     * 
     * @return true if there is a receivesDataStream property value.
     */
    boolean hasReceivesDataStream();

    /**
     * Adds a receivesDataStream property value.<p>
     * 
     * @param newReceivesDataStream the receivesDataStream property value to be added
     */
    void addReceivesDataStream(DataStream newReceivesDataStream);

    /**
     * Removes a receivesDataStream property value.<p>
     * 
     * @param oldReceivesDataStream the receivesDataStream property value to be removed.
     */
    void removeReceivesDataStream(DataStream oldReceivesDataStream);


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
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfAssignment
     */
     
    /**
     * Gets all property values for the hasNumberOfAssignment property.<p>
     * 
     * @returns a collection of values for the hasNumberOfAssignment property.
     */
    Collection<? extends Integer> getHasNumberOfAssignment();

    /**
     * Checks if the class has a hasNumberOfAssignment property value.<p>
     * 
     * @return true if there is a hasNumberOfAssignment property value.
     */
    boolean hasHasNumberOfAssignment();

    /**
     * Adds a hasNumberOfAssignment property value.<p>
     * 
     * @param newHasNumberOfAssignment the hasNumberOfAssignment property value to be added
     */
    void addHasNumberOfAssignment(Integer newHasNumberOfAssignment);

    /**
     * Removes a hasNumberOfAssignment property value.<p>
     * 
     * @param oldHasNumberOfAssignment the hasNumberOfAssignment property value to be removed.
     */
    void removeHasNumberOfAssignment(Integer oldHasNumberOfAssignment);



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
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#isActive
     */
     
    /**
     * Gets all property values for the isActive property.<p>
     * 
     * @returns a collection of values for the isActive property.
     */
    Collection<? extends Boolean> getIsActive();

    /**
     * Checks if the class has a isActive property value.<p>
     * 
     * @return true if there is a isActive property value.
     */
    boolean hasIsActive();

    /**
     * Adds a isActive property value.<p>
     * 
     * @param newIsActive the isActive property value to be added
     */
    void addIsActive(Boolean newIsActive);

    /**
     * Removes a isActive property value.<p>
     * 
     * @param oldIsActive the isActive property value to be removed.
     */
    void removeIsActive(Boolean oldIsActive);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
