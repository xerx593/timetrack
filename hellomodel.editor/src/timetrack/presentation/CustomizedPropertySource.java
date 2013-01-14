package timetrack.presentation;

import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;

public class CustomizedPropertySource extends PropertySource {

	public CustomizedPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.edit.ui.provider.PropertySource#createPropertyDescriptor
	 * (org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
//	 */
//	@Override
//	protected IPropertyDescriptor createPropertyDescriptor(
//			IItemPropertyDescriptor itemPropertyDescriptor) {
//		IPropertyDescriptor result = super.createPropertyDescriptor(itemPropertyDescriptor);
//		if (result == null)
//			return result;
//		EClassifier eType = ((EStructuralFeature) itemPropertyDescriptor
//				.getFeature(object)).getEType();
//		if (eType instanceof EDataType) {
//			EDataType eDataType = (EDataType) eType;
//			if (eDataType.getInstanceClass() == Date.class) {
//				result = new ExtendedDialogCellEditor(composite,
//						getEditLabelProvider()) {
//					protected Object openDialogBox(Control cellEditorWindow) {
//						final DateTime dateTime[] = new DateTime[1];
//						final Date[] date = new Date[1];
//						Dialog d = new Dialog(cellEditorWindow.getShell()) {
//							protected Control createDialogArea(Composite parent) {
//								Composite dialogArea = (Composite) super
//										.createDialogArea(parent);
//								dateTime[0] = new DateTime(dialogArea,
//										SWT.CALENDAR);
//								dateTime[0]
//										.addSelectionListener(new SelectionAdapter() {
//											public void widgetSelected(
//													SelectionEvent e) {
//												Date dateValue = new Date();
//												dateValue.setYear(dateTime[0]
//														.getYear());
//												dateValue.setMonth(dateTime[0]
//														.getMonth());
//												dateValue.setDate(dateTime[0]
//														.getDay());
//												date[0] = dateValue;
//												super.widgetSelected(e);
//											}
//										});
//								return dialogArea;
//							}
//						};
//						d.setBlockOnOpen(true);
//						d.open();
//						if (d.getReturnCode() == Dialog.OK) {
//							return date[0];
//						}
//						return null;
//					}
//				};
//			}
//		}
//		return result;
//	}

}
