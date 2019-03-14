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
 * Source Class: DefaultOutput <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */
public class DefaultOutput extends WrappedIndividualImpl implements Output {

    public DefaultOutput(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#actsOver
     */
     
    public Collection<? extends Entity> getActsOver() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ACTSOVER,
                                               DefaultEntity.class);
    }

    public boolean hasActsOver() {
	   return !getActsOver().isEmpty();
    }

    public void addActsOver(Entity newActsOver) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ACTSOVER,
                                       newActsOver);
    }

    public void removeActsOver(Entity oldActsOver) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ACTSOVER,
                                          oldActsOver);
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
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#isContextVariableOf
     */
     
    public Collection<? extends DataStream> getIsContextVariableOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISCONTEXTVARIABLEOF,
                                               DefaultDataStream.class);
    }

    public boolean hasIsContextVariableOf() {
	   return !getIsContextVariableOf().isEmpty();
    }

    public void addIsContextVariableOf(DataStream newIsContextVariableOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISCONTEXTVARIABLEOF,
                                       newIsContextVariableOf);
    }

    public void removeIsContextVariableOf(DataStream oldIsContextVariableOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISCONTEXTVARIABLEOF,
                                          oldIsContextVariableOf);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDataType
     */
     
    public Collection<? extends String> getHasDataType() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDATATYPE, String.class);
    }

    public boolean hasHasDataType() {
		return !getHasDataType().isEmpty();
    }

    public void addHasDataType(String newHasDataType) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDATATYPE, newHasDataType);
    }

    public void removeHasDataType(String oldHasDataType) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDATATYPE, oldHasDataType);
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
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasValue
     */
     
    public Collection<? extends Object> getHasValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVALUE, Object.class);
    }

    public boolean hasHasValue() {
		return !getHasValue().isEmpty();
    }

    public void addHasValue(Object newHasValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVALUE, newHasValue);
    }

    public void removeHasValue(Object oldHasValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVALUE, oldHasValue);
    }


}
