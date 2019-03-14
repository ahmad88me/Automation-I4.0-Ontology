package aI40minontology.impl;

import aI40minontology.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultState <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */
public class DefaultState extends WrappedIndividualImpl implements State {

    public DefaultState(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSequence
     */
     
    public Collection<? extends Sequence> getBelongsToSequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                               DefaultSequence.class);
    }

    public boolean hasBelongsToSequence() {
	   return !getBelongsToSequence().isEmpty();
    }

    public void addBelongsToSequence(Sequence newBelongsToSequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                       newBelongsToSequence);
    }

    public void removeBelongsToSequence(Sequence oldBelongsToSequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                          oldBelongsToSequence);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSubsequence
     */
     
    public Collection<? extends Subsequence> getBelongsToSubsequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_BELONGSTOSUBSEQUENCE,
                                               DefaultSubsequence.class);
    }

    public boolean hasBelongsToSubsequence() {
	   return !getBelongsToSubsequence().isEmpty();
    }

    public void addBelongsToSubsequence(Subsequence newBelongsToSubsequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_BELONGSTOSUBSEQUENCE,
                                       newBelongsToSubsequence);
    }

    public void removeBelongsToSubsequence(Subsequence oldBelongsToSubsequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_BELONGSTOSUBSEQUENCE,
                                          oldBelongsToSubsequence);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#finalizesLoop
     */
     
    public Collection<? extends Loop> getFinalizesLoop() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_FINALIZESLOOP,
                                               DefaultLoop.class);
    }

    public boolean hasFinalizesLoop() {
	   return !getFinalizesLoop().isEmpty();
    }

    public void addFinalizesLoop(Loop newFinalizesLoop) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_FINALIZESLOOP,
                                       newFinalizesLoop);
    }

    public void removeFinalizesLoop(Loop oldFinalizesLoop) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_FINALIZESLOOP,
                                          oldFinalizesLoop);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#finalizesSubsequence
     */
     
    public Collection<? extends Subsequence> getFinalizesSubsequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_FINALIZESSUBSEQUENCE,
                                               DefaultSubsequence.class);
    }

    public boolean hasFinalizesSubsequence() {
	   return !getFinalizesSubsequence().isEmpty();
    }

    public void addFinalizesSubsequence(Subsequence newFinalizesSubsequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_FINALIZESSUBSEQUENCE,
                                       newFinalizesSubsequence);
    }

    public void removeFinalizesSubsequence(Subsequence oldFinalizesSubsequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_FINALIZESSUBSEQUENCE,
                                          oldFinalizesSubsequence);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNextState
     */
     
    public Collection<? extends State> getHasNextState() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASNEXTSTATE,
                                               DefaultState.class);
    }

    public boolean hasHasNextState() {
	   return !getHasNextState().isEmpty();
    }

    public void addHasNextState(State newHasNextState) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASNEXTSTATE,
                                       newHasNextState);
    }

    public void removeHasNextState(State oldHasNextState) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASNEXTSTATE,
                                          oldHasNextState);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasPreviousState
     */
     
    public Collection<? extends State> getHasPreviousState() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASPREVIOUSSTATE,
                                               DefaultState.class);
    }

    public boolean hasHasPreviousState() {
	   return !getHasPreviousState().isEmpty();
    }

    public void addHasPreviousState(State newHasPreviousState) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASPREVIOUSSTATE,
                                       newHasPreviousState);
    }

    public void removeHasPreviousState(State oldHasPreviousState) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASPREVIOUSSTATE,
                                          oldHasPreviousState);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasResource
     */
     
    public Collection<? extends Resource> getHasResource() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASRESOURCE,
                                               DefaultResource.class);
    }

    public boolean hasHasResource() {
	   return !getHasResource().isEmpty();
    }

    public void addHasResource(Resource newHasResource) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASRESOURCE,
                                       newHasResource);
    }

    public void removeHasResource(Resource oldHasResource) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASRESOURCE,
                                          oldHasResource);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasStateFunction
     */
     
    public Collection<? extends StateFunction> getHasStateFunction() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASSTATEFUNCTION,
                                               DefaultStateFunction.class);
    }

    public boolean hasHasStateFunction() {
	   return !getHasStateFunction().isEmpty();
    }

    public void addHasStateFunction(StateFunction newHasStateFunction) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASSTATEFUNCTION,
                                       newHasStateFunction);
    }

    public void removeHasStateFunction(StateFunction oldHasStateFunction) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASSTATEFUNCTION,
                                          oldHasStateFunction);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#initializesLoop
     */
     
    public Collection<? extends Loop> getInitializesLoop() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INITIALIZESLOOP,
                                               DefaultLoop.class);
    }

    public boolean hasInitializesLoop() {
	   return !getInitializesLoop().isEmpty();
    }

    public void addInitializesLoop(Loop newInitializesLoop) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INITIALIZESLOOP,
                                       newInitializesLoop);
    }

    public void removeInitializesLoop(Loop oldInitializesLoop) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INITIALIZESLOOP,
                                          oldInitializesLoop);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#initializesSubsequence
     */
     
    public Collection<? extends Subsequence> getInitializesSubsequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INITIALIZESSUBSEQUENCE,
                                               DefaultSubsequence.class);
    }

    public boolean hasInitializesSubsequence() {
	   return !getInitializesSubsequence().isEmpty();
    }

    public void addInitializesSubsequence(Subsequence newInitializesSubsequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INITIALIZESSUBSEQUENCE,
                                       newInitializesSubsequence);
    }

    public void removeInitializesSubsequence(Subsequence oldInitializesSubsequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INITIALIZESSUBSEQUENCE,
                                          oldInitializesSubsequence);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#isConnectedToArc
     */
     
    public Collection<? extends Arc> getIsConnectedToArc() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOARC,
                                               DefaultArc.class);
    }

    public boolean hasIsConnectedToArc() {
	   return !getIsConnectedToArc().isEmpty();
    }

    public void addIsConnectedToArc(Arc newIsConnectedToArc) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOARC,
                                       newIsConnectedToArc);
    }

    public void removeIsConnectedToArc(Arc oldIsConnectedToArc) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOARC,
                                          oldIsConnectedToArc);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#isConnectedToTransition
     */
     
    public Collection<? extends Transition> getIsConnectedToTransition() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOTRANSITION,
                                               DefaultTransition.class);
    }

    public boolean hasIsConnectedToTransition() {
	   return !getIsConnectedToTransition().isEmpty();
    }

    public void addIsConnectedToTransition(Transition newIsConnectedToTransition) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOTRANSITION,
                                       newIsConnectedToTransition);
    }

    public void removeIsConnectedToTransition(Transition oldIsConnectedToTransition) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOTRANSITION,
                                          oldIsConnectedToTransition);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#receivesDataStream
     */
     
    public Collection<? extends DataStream> getReceivesDataStream() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_RECEIVESDATASTREAM,
                                               DefaultDataStream.class);
    }

    public boolean hasReceivesDataStream() {
	   return !getReceivesDataStream().isEmpty();
    }

    public void addReceivesDataStream(DataStream newReceivesDataStream) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_RECEIVESDATASTREAM,
                                       newReceivesDataStream);
    }

    public void removeReceivesDataStream(DataStream oldReceivesDataStream) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_RECEIVESDATASTREAM,
                                          oldReceivesDataStream);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDescription
     */
     
    public Collection<? extends String> getHasDescription() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, String.class);
    }

    public boolean hasHasDescription() {
		return !getHasDescription().isEmpty();
    }

    public void addHasDescription(String newHasDescription) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, newHasDescription);
    }

    public void removeHasDescription(String oldHasDescription) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, oldHasDescription);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasIdentifier
     */
     
    public Collection<? extends Integer> getHasIdentifier() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, Integer.class);
    }

    public boolean hasHasIdentifier() {
		return !getHasIdentifier().isEmpty();
    }

    public void addHasIdentifier(Integer newHasIdentifier) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, newHasIdentifier);
    }

    public void removeHasIdentifier(Integer oldHasIdentifier) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, oldHasIdentifier);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfAssignment
     */
     
    public Collection<? extends Integer> getHasNumberOfAssignment() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFASSIGNMENT, Integer.class);
    }

    public boolean hasHasNumberOfAssignment() {
		return !getHasNumberOfAssignment().isEmpty();
    }

    public void addHasNumberOfAssignment(Integer newHasNumberOfAssignment) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFASSIGNMENT, newHasNumberOfAssignment);
    }

    public void removeHasNumberOfAssignment(Integer oldHasNumberOfAssignment) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFASSIGNMENT, oldHasNumberOfAssignment);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfTasks
     */
     
    public Collection<? extends Integer> getHasNumberOfTasks() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, Integer.class);
    }

    public boolean hasHasNumberOfTasks() {
		return !getHasNumberOfTasks().isEmpty();
    }

    public void addHasNumberOfTasks(Integer newHasNumberOfTasks) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, newHasNumberOfTasks);
    }

    public void removeHasNumberOfTasks(Integer oldHasNumberOfTasks) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, oldHasNumberOfTasks);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#isActive
     */
     
    public Collection<? extends Boolean> getIsActive() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISACTIVE, Boolean.class);
    }

    public boolean hasIsActive() {
		return !getIsActive().isEmpty();
    }

    public void addIsActive(Boolean newIsActive) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISACTIVE, newIsActive);
    }

    public void removeIsActive(Boolean oldIsActive) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISACTIVE, oldIsActive);
    }


}
