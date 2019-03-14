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
 * Source Class: DefaultDevice <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */
public class DefaultDevice extends WrappedIndividualImpl implements Device {

    public DefaultDevice(CodeGenerationInference inference, IRI iri) {
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
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#executes
     */
     
    public Collection<? extends Function> getExecutes() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_EXECUTES,
                                               DefaultFunction.class);
    }

    public boolean hasExecutes() {
	   return !getExecutes().isEmpty();
    }

    public void addExecutes(Function newExecutes) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_EXECUTES,
                                       newExecutes);
    }

    public void removeExecutes(Function oldExecutes) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_EXECUTES,
                                          oldExecutes);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#executesAServiceFunction
     */
     
    public Collection<? extends As_a_ServiceFunction> getExecutesAServiceFunction() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_EXECUTESASERVICEFUNCTION,
                                               DefaultAs_a_ServiceFunction.class);
    }

    public boolean hasExecutesAServiceFunction() {
	   return !getExecutesAServiceFunction().isEmpty();
    }

    public void addExecutesAServiceFunction(As_a_ServiceFunction newExecutesAServiceFunction) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_EXECUTESASERVICEFUNCTION,
                                       newExecutesAServiceFunction);
    }

    public void removeExecutesAServiceFunction(As_a_ServiceFunction oldExecutesAServiceFunction) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_EXECUTESASERVICEFUNCTION,
                                          oldExecutesAServiceFunction);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#generates
     */
     
    public Collection<? extends Information> getGenerates() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_GENERATES,
                                               DefaultInformation.class);
    }

    public boolean hasGenerates() {
	   return !getGenerates().isEmpty();
    }

    public void addGenerates(Information newGenerates) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_GENERATES,
                                       newGenerates);
    }

    public void removeGenerates(Information oldGenerates) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_GENERATES,
                                          oldGenerates);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#interacts
     */
     
    public Collection<? extends Actor> getInteracts() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INTERACTS,
                                               DefaultActor.class);
    }

    public boolean hasInteracts() {
	   return !getInteracts().isEmpty();
    }

    public void addInteracts(Actor newInteracts) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INTERACTS,
                                       newInteracts);
    }

    public void removeInteracts(Actor oldInteracts) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INTERACTS,
                                          oldInteracts);
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
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#offers
     */
     
    public Collection<? extends Service> getOffers() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OFFERS,
                                               DefaultService.class);
    }

    public boolean hasOffers() {
	   return !getOffers().isEmpty();
    }

    public void addOffers(Service newOffers) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OFFERS,
                                       newOffers);
    }

    public void removeOffers(Service oldOffers) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OFFERS,
                                          oldOffers);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#receives
     */
     
    public Collection<? extends Information> getReceives() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_RECEIVES,
                                               DefaultInformation.class);
    }

    public boolean hasReceives() {
	   return !getReceives().isEmpty();
    }

    public void addReceives(Information newReceives) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_RECEIVES,
                                       newReceives);
    }

    public void removeReceives(Information oldReceives) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_RECEIVES,
                                          oldReceives);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#understands
     */
     
    public Collection<? extends WrappedIndividual> getUnderstands() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_UNDERSTANDS,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasUnderstands() {
	   return !getUnderstands().isEmpty();
    }

    public void addUnderstands(WrappedIndividual newUnderstands) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_UNDERSTANDS,
                                       newUnderstands);
    }

    public void removeUnderstands(WrappedIndividual oldUnderstands) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_UNDERSTANDS,
                                          oldUnderstands);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToArchitectureLevel
     */
     
    public Collection<? extends Integer> getBelongsToArchitectureLevel() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_BELONGSTOARCHITECTURELEVEL, Integer.class);
    }

    public boolean hasBelongsToArchitectureLevel() {
		return !getBelongsToArchitectureLevel().isEmpty();
    }

    public void addBelongsToArchitectureLevel(Integer newBelongsToArchitectureLevel) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_BELONGSTOARCHITECTURELEVEL, newBelongsToArchitectureLevel);
    }

    public void removeBelongsToArchitectureLevel(Integer oldBelongsToArchitectureLevel) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_BELONGSTOARCHITECTURELEVEL, oldBelongsToArchitectureLevel);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasCharacteristic
     */
     
    public Collection<? extends String> getHasCharacteristic() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCHARACTERISTIC, String.class);
    }

    public boolean hasHasCharacteristic() {
		return !getHasCharacteristic().isEmpty();
    }

    public void addHasCharacteristic(String newHasCharacteristic) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCHARACTERISTIC, newHasCharacteristic);
    }

    public void removeHasCharacteristic(String oldHasCharacteristic) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASCHARACTERISTIC, oldHasCharacteristic);
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
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasInteroperabilityDegree
     */
     
    public Collection<? extends String> getHasInteroperabilityDegree() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINTEROPERABILITYDEGREE, String.class);
    }

    public boolean hasHasInteroperabilityDegree() {
		return !getHasInteroperabilityDegree().isEmpty();
    }

    public void addHasInteroperabilityDegree(String newHasInteroperabilityDegree) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINTEROPERABILITYDEGREE, newHasInteroperabilityDegree);
    }

    public void removeHasInteroperabilityDegree(String oldHasInteroperabilityDegree) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINTEROPERABILITYDEGREE, oldHasInteroperabilityDegree);
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
