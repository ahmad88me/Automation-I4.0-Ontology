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
 * Source Class: DefaultArc <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */
public class DefaultArc extends WrappedIndividualImpl implements Arc {

    public DefaultArc(CodeGenerationInference inference, IRI iri) {
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
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasSinkPoint
     */
     
    public Collection<? extends WrappedIndividual> getHasSinkPoint() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASSINKPOINT,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHasSinkPoint() {
	   return !getHasSinkPoint().isEmpty();
    }

    public void addHasSinkPoint(WrappedIndividual newHasSinkPoint) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASSINKPOINT,
                                       newHasSinkPoint);
    }

    public void removeHasSinkPoint(WrappedIndividual oldHasSinkPoint) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASSINKPOINT,
                                          oldHasSinkPoint);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasSourcePoint
     */
     
    public Collection<? extends WrappedIndividual> getHasSourcePoint() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASSOURCEPOINT,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHasSourcePoint() {
	   return !getHasSourcePoint().isEmpty();
    }

    public void addHasSourcePoint(WrappedIndividual newHasSourcePoint) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASSOURCEPOINT,
                                       newHasSourcePoint);
    }

    public void removeHasSourcePoint(WrappedIndividual oldHasSourcePoint) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASSOURCEPOINT,
                                          oldHasSourcePoint);
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


}
