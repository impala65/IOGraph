package com.iographica.osx;

import java.util.ArrayList;

import com.iographica.events.IEventDispatcher;
import com.iographica.events.IEventHandler;

//public class OSXAboutHandler implements AboutHandler, IEventDispatcher {
public class OSXAboutHandler implements IEventDispatcher {

	private ArrayList<IEventHandler> _eventHandlers;

	public void addEventHandler(IEventHandler handler) {
		if (_eventHandlers == null) {
			_eventHandlers = new ArrayList<IEventHandler>();
		}
		_eventHandlers.add(handler);
	}

//	private void dispatchEvent(int type) {
//		if (_eventHandlers != null) {
//			final IOEvent event = new IOEvent(type, this);
//			for (IEventHandler handler : _eventHandlers) {
//				handler.onEvent(event);
//			}
//		}
//	}

//	public void handleAbout(AboutEvent e) {
//		dispatchEvent(Data.SHOW_ABOUT);
//	}
}
