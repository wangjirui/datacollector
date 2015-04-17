/**
 * (c) 2014 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.stage.origin.logtail;

import com.streamsets.pipeline.api.base.BaseEnumChooserValues;

public class RolledFilesModeChooserValues extends BaseEnumChooserValues {

  public RolledFilesModeChooserValues() {
    super(FilesRollMode.class);
  }

}
