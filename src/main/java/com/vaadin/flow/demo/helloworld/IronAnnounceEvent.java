package com.vaadin.flow.demo.helloworld;

import com.vaadin.annotations.DomEvent;
import com.vaadin.ui.ComponentEvent;

@DomEvent("iron-announce")
public class IronAnnounceEvent extends ComponentEvent<PaperToast> {
    public IronAnnounceEvent(PaperToast source, boolean fromClient) {
        super(source, fromClient);
    }
}
