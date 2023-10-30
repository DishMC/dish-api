package net.ouja.api.event.world.level.chunk;

import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.world.level.chunk.ChunkPos;
import net.ouja.api.world.level.chunk.Structure;

public class StructureGenerateEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final Structure structure;
    private final ChunkPos chunkPos;


    public StructureGenerateEvent(Structure structure, ChunkPos chunkPos) {
        this.structure = structure;
        this.chunkPos = chunkPos;
    }

    public Structure getStructure() {
        return structure;
    }

    public ChunkPos getChunkPos() {
        return chunkPos;
    }

    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }
}
