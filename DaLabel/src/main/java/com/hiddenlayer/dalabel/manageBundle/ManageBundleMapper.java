package com.hiddenlayer.dalabel.manageBundle;

import java.util.ArrayList;

import com.hiddenlayer.dalabel.manageLabeling.DataBundle;

public interface ManageBundleMapper {
	public abstract int regLabelingBundle(DataBundle db);
	public abstract ArrayList<DataBundle> getAllBundle(ManageBundleSelector mls);
	public abstract int getAllBundleCount(String id);
}
