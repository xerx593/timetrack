package timetrack.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

public class CustomizedAdapterFactoryContentProvider extends
		AdapterFactoryContentProvider implements IPropertySourceProvider {

	public CustomizedAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#createPropertySource(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertySource)
	 */
	@Override
	protected IPropertySource createPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		// TODO Auto-generated method stub
		return new CustomizedPropertySource(object, itemPropertySource);
	}


}
