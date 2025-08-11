package com.dmedhelm;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DmhDetailsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DmhDetailsPlugin.class);
		RuneLite.main(args);
	}
}