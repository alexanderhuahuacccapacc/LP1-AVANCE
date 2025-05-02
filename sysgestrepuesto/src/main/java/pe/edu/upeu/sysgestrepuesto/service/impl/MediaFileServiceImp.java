package pe.edu.upeu.sysgestrepuesto.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import pe.edu.upeu.sysgestrepuesto.model.MediaFile;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.repository.IMediaFileRepository;
import pe.edu.upeu.sysgestrepuesto.service.IMediaFileService;

@Transactional
@Service
@RequiredArgsConstructor

public class MediaFileServiceImp extends CrudGenericoServiceImp <MediaFile, Long> implements IMediaFileService {

    private final IMediaFileRepository mediaFileRepository;

    @Override
    protected ICrudGenericoRepository<MediaFile, Long>  getRepo() {
        return mediaFileRepository;
    }
}
