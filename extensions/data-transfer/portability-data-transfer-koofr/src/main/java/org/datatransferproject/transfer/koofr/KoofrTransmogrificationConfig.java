package org.datatransferproject.transfer.koofr;

import org.datatransferproject.types.common.models.TransmogrificationConfig;

// This class defines transmogrification paramaters for Koofr imports
public class KoofrTransmogrificationConfig extends TransmogrificationConfig {
  /** Koofr has forbidden characters for file names */
  private static final String PHOTO_TITLE_FORBIDDEN_CHARACTERS = "~\"#%&*:<>?/\\{|}";

  private static final String ALBUM_NAME_FORBIDDEN_CHARACTERS = "~\"#%&*:<>?/\\{|}";

  /** We need to override the methods */
  @Override
  public String getPhotoTitleForbiddenCharacters() {
    return PHOTO_TITLE_FORBIDDEN_CHARACTERS;
  }

  @Override
  public String getAlbumNameForbiddenCharacters() {
    return ALBUM_NAME_FORBIDDEN_CHARACTERS;
  }
}
