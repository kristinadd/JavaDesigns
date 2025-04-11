package PerfectVersion;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class AccountService {
    private final Map<UUID, BankAccount> store = new ConcurrentHashMap<>();

    public void create(BankAccount account) {
        store.put(account.getId(), account);
    }

    public BankAccount read(UUID id) {
        return store.get(id);
    }

    public void update(BankAccount account) {
        store.put(account.getId(), account);
    }

    public void delete(UUID id) {
        store.remove(id);
    }

    public Map<UUID, BankAccount> readAll() {
        return store;
    }
}
