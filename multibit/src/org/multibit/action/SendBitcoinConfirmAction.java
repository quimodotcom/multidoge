package org.multibit.action;

import org.multibit.Localiser;
import org.multibit.controller.ActionForward;
import org.multibit.controller.MultiBitController;
import org.multibit.model.DataProvider;

/**
 * an action to the send bitcoin confirm view
 * @author jim
 *
 */
public class SendBitcoinConfirmAction implements Action {

    private MultiBitController controller;
    private Localiser localiser;
    
    public SendBitcoinConfirmAction(MultiBitController controller, Localiser localiser) {
        this.controller = controller;
        this.localiser = localiser;     
    }
    
    public void execute(DataProvider dataProvider) {
        // no changes required to model
        
        controller.setActionForwardToChild(ActionForward.FORWARD_TO_SEND_BITCOIN_CONFIRM);       
    }
    
    public String getDisplayText() {
        // TODO localise
        return "send";
    }
}