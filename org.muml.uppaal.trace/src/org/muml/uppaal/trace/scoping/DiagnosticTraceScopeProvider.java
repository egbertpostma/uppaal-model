/*
 * generated by Xtext
 */
package org.muml.uppaal.trace.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.muml.uppaal.NTA;
import org.muml.uppaal.UppaalPackage;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.declarations.DataVariableDeclaration;
import org.muml.uppaal.declarations.Declaration;
import org.muml.uppaal.declarations.Declarations;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.Variable;
import org.muml.uppaal.declarations.VariableDeclaration;
import org.muml.uppaal.declarations.global.GlobalPackage;
import org.muml.uppaal.declarations.system.SystemPackage;
import org.muml.uppaal.expressions.ExpressionsPackage;
import org.muml.uppaal.statements.StatementsPackage;
import org.muml.uppaal.templates.AbstractTemplate;
import org.muml.uppaal.templates.RedefinedTemplate;
import org.muml.uppaal.templates.Template;
import org.muml.uppaal.templates.TemplatesPackage;
import org.muml.uppaal.trace.diagnosticTrace.LocationActivity;
import org.muml.uppaal.trace.diagnosticTrace.NamedElementReference;
import org.muml.uppaal.trace.diagnosticTrace.ProcessIdentifier;
import org.muml.uppaal.trace.diagnosticTrace.SingleNamedElementReference;
import org.muml.uppaal.types.DeclaredType;
import org.muml.uppaal.types.StructTypeSpecification;
import org.muml.uppaal.types.Type;
import org.muml.uppaal.types.TypeDefinition;
import org.muml.uppaal.types.TypeReference;
import org.muml.uppaal.types.TypeSpecification;
import org.muml.uppaal.types.TypesPackage;
import org.muml.uppaal.visuals.VisualsPackage;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class DiagnosticTraceScopeProvider extends
		AbstractDeclarativeScopeProvider {

	private NTA nta;
	
	public void setNTA(NTA nta) {
		this.nta = nta;
	}
	
	private NTA getNTA() {
		
		if (nta == null) {
			setNTA(loadNTA());
		};
		
		return nta;
		
	}
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		IScope scope = super.getScope(context, reference);
		return scope;
	}
	
	
	// XXX: only for debugging purposes
	static NTA loadNTA() {

		// Initialize the model
		UppaalPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		DeclarationsPackage.eINSTANCE.eClass();
		GlobalPackage.eINSTANCE.eClass();
		SystemPackage.eINSTANCE.eClass();
		TemplatesPackage.eINSTANCE.eClass();
		StatementsPackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();
		VisualsPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .uppaal extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("uppaal", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createPlatformResourceURI(
				"FASE 2014/model/Overtaking.uppaal", true), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		NTA nta = (NTA) resource.getContents().get(0);
		return nta;
	}

	List<AbstractTemplate> getTemplates(NTA nta) {

		List<AbstractTemplate> templates = new ArrayList<AbstractTemplate>();

		Iterator<EObject> iterator = nta.eAllContents();

		while (iterator.hasNext()) {

			EObject eObject = iterator.next();

			if (eObject instanceof AbstractTemplate) {
				templates.add((AbstractTemplate) eObject);
			}

		}

		return templates;

	}

	private Template getBaseTemplate(AbstractTemplate abstractTemplate) {

		if (abstractTemplate instanceof Template) {
			return (Template) abstractTemplate;
		}

		if (abstractTemplate instanceof RedefinedTemplate) {
			return getBaseTemplate(((RedefinedTemplate) abstractTemplate)
					.getReferredTemplate());
		}

		return null;

	}
	
	IScope scope_AbstractTemplate(ProcessIdentifier process, EReference ref) {
		
		return Scopes.scopeFor(getTemplates(getNTA()));
		
	}

	IScope scope_Location(LocationActivity locationActivity, EReference ref) {

		ProcessIdentifier process = locationActivity.getProcess();

		if (process != null) {

			Template baseTemplate = getBaseTemplate(process.getTemplate());

			return Scopes.scopeFor(baseTemplate.getLocation());

		}

		return IScope.NULLSCOPE;
	}

	IScope scope_ProcessIdentifier_template(EObject eObject, EReference ref) {

		return Scopes.scopeFor(getTemplates(getNTA()));

	}

	IScope scope_SingleNamedElementReference_namedElement(
			NamedElementReference namedElementReference, EReference ref) {

		SingleNamedElementReference singleReference = namedElementReference
				.getSingleNamedElementReference();

		NamedElement namedElement = singleReference.getNamedElement();

		return Scopes.scopeFor(getVariables(namedElement));

	}

	IScope scope_SingleNamedElementReference_namedElement(EObject eObject,
			EReference ref) {

		List<NamedElement> namedElements = new ArrayList<NamedElement>();

		namedElements.addAll(getGlobalVariables(getNTA()));
		namedElements.addAll(getTemplates(getNTA()));

		return Scopes.scopeFor(namedElements);

	}

	List<Variable> getVariables(NamedElement namedElement) {

		if (namedElement instanceof NTA) {
			return getGlobalVariables((NTA) namedElement);
		}

		if (namedElement instanceof AbstractTemplate) {
			return getLocalVariables((AbstractTemplate) namedElement);
		}

		if (namedElement instanceof Variable) {
			return getFields((Variable) namedElement);
		}

		return Collections.emptyList();

	}

	List<Variable> getGlobalVariables(NTA nta) {

		List<Variable> variables = new ArrayList<Variable>();

		Iterator<EObject> iterator = nta.eAllContents();

		while (iterator.hasNext()) {

			EObject eObject = iterator.next();

			if (eObject instanceof Variable) {
				variables.add((Variable) eObject);
			}

		}

		return variables;

	}

	List<Variable> getLocalVariables(AbstractTemplate abstractTemplate) {

		List<Variable> variables = new ArrayList<Variable>();

		Template template = getBaseTemplate(abstractTemplate);

		Declarations declarations = template.getDeclarations();

		for (Declaration declaration : declarations.getDeclaration()) {

			if (declaration instanceof VariableDeclaration) {

				VariableDeclaration variableDeclaration = (VariableDeclaration) declaration;

				variables.addAll(variableDeclaration.getVariable());

			}

		}

		return variables;

	}

	List<Variable> getFields(Variable variable) {

		List<Variable> fields = new ArrayList<Variable>();

		TypeSpecification typeSpecification = getTypeSpecification(variable
				.getTypeDefinition());

		if (typeSpecification instanceof StructTypeSpecification) {

			StructTypeSpecification struct = (StructTypeSpecification) typeSpecification;

			for (DataVariableDeclaration declaration : struct.getDeclaration()) {
				fields.addAll((declaration.getVariable()));
			}

		}

		return fields;

	}

	TypeSpecification getTypeSpecification(TypeDefinition typeDefinition) {

		if (typeDefinition instanceof TypeSpecification) {
			return (TypeSpecification) typeDefinition;
		}

		if (typeDefinition instanceof TypeReference) {

			Type type = ((TypeReference) typeDefinition).getReferredType();

			if (type instanceof DeclaredType) {

				return getTypeSpecification(((DeclaredType) type)
						.getTypeDefinition());

			}

		}

		return null;

	}

}