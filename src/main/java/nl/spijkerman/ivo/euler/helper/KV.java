package nl.spijkerman.ivo.euler.helper;

import java.util.Map;

public class  KV<K, V> implements Map.Entry<K, V> {

    private final K k;
    private final V v;

    public KV(K k, V v) {
        this.k = k;
        this.v = v;
    }

    @Override
    public K getKey() {
        return k;
    }

    @Override
    public V getValue() {
        return v;
    }

    @Override
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
