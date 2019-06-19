package org.zpha.weixin.menu.service;

import org.zpha.weixin.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu getMenu();

	void saveMenu(SelfMenu selfMenu);

}
