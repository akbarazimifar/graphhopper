/*
 *  Copyright 2012 Peter Karich info@jetsli.de
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.jetsli.graph.storage;

import de.jetsli.graph.util.EdgeSkipIterator;

/**
 * Extended graph interface which supports storing and retrieving priorities per node.
 *
 * @author Peter Karich, info@jetsli.de
 */
public interface PriorityGraph extends Graph {

    void setPriority(int index, int prio);

    int getPriority(int index);

    void shortcut(int a, int b, double distance, int flags, int shortcutNode);
    
    @Override
    public EdgeSkipIterator getEdges(int nodeId);

    @Override
    public EdgeSkipIterator getIncoming(int nodeId);

    @Override
    public EdgeSkipIterator getOutgoing(int nodeId);
}
