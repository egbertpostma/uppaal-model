/**
 */
package org.muml.uppaal.declarations.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.muml.uppaal.declarations.util.DeclarationsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationsItemProviderAdapterFactory extends DeclarationsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.GlobalDeclarations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalDeclarationsItemProvider globalDeclarationsItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.GlobalDeclarations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalDeclarationsAdapter() {
		if (globalDeclarationsItemProvider == null) {
			globalDeclarationsItemProvider = new GlobalDeclarationsItemProvider(this);
		}

		return globalDeclarationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.LocalDeclarations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalDeclarationsItemProvider localDeclarationsItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.LocalDeclarations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocalDeclarationsAdapter() {
		if (localDeclarationsItemProvider == null) {
			localDeclarationsItemProvider = new LocalDeclarationsItemProvider(this);
		}

		return localDeclarationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.SystemDeclarations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDeclarationsItemProvider systemDeclarationsItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.SystemDeclarations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemDeclarationsAdapter() {
		if (systemDeclarationsItemProvider == null) {
			systemDeclarationsItemProvider = new SystemDeclarationsItemProvider(this);
		}

		return systemDeclarationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.TypeDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationItemProvider typeDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.TypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeDeclarationAdapter() {
		if (typeDeclarationItemProvider == null) {
			typeDeclarationItemProvider = new TypeDeclarationItemProvider(this);
		}

		return typeDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.ExpressionInitializer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionInitializerItemProvider expressionInitializerItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.ExpressionInitializer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionInitializerAdapter() {
		if (expressionInitializerItemProvider == null) {
			expressionInitializerItemProvider = new ExpressionInitializerItemProvider(this);
		}

		return expressionInitializerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.ArrayInitializer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInitializerItemProvider arrayInitializerItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.ArrayInitializer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayInitializerAdapter() {
		if (arrayInitializerItemProvider == null) {
			arrayInitializerItemProvider = new ArrayInitializerItemProvider(this);
		}

		return arrayInitializerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.TypedDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedDeclarationItemProvider typedDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.TypedDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypedDeclarationAdapter() {
		if (typedDeclarationItemProvider == null) {
			typedDeclarationItemProvider = new TypedDeclarationItemProvider(this);
		}

		return typedDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.declarations.ParameterContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterContainerItemProvider parameterContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.declarations.ParameterContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterContainerAdapter() {
		if (parameterContainerItemProvider == null) {
			parameterContainerItemProvider = new ParameterContainerItemProvider(this);
		}

		return parameterContainerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (globalDeclarationsItemProvider != null) globalDeclarationsItemProvider.dispose();
		if (localDeclarationsItemProvider != null) localDeclarationsItemProvider.dispose();
		if (systemDeclarationsItemProvider != null) systemDeclarationsItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (typeDeclarationItemProvider != null) typeDeclarationItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (expressionInitializerItemProvider != null) expressionInitializerItemProvider.dispose();
		if (arrayInitializerItemProvider != null) arrayInitializerItemProvider.dispose();
		if (typedDeclarationItemProvider != null) typedDeclarationItemProvider.dispose();
		if (parameterContainerItemProvider != null) parameterContainerItemProvider.dispose();
	}

}
