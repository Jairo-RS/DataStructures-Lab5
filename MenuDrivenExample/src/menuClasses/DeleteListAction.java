package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {
	
	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg;
		IOComponent io = IOComponent.getComponent();
		io.output("\nDeleting a list of Integer values from the system:\n");
		String listName = io.getInput("\nEnter name of the list to be removed: ");
		dm.removeList(listName);
	}

}
