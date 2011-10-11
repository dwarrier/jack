
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20110324000133 */
package com.rapleaf.jack.test_project.database_1.mock_impl;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Timestamp;

import com.rapleaf.jack.AbstractMockDatabaseModel;
import com.rapleaf.jack.ModelWithId;

import com.rapleaf.jack.test_project.database_1.models.Comment;
import com.rapleaf.jack.test_project.database_1.iface.ICommentPersistence;

import com.rapleaf.jack.test_project.IDatabases;

public class BaseMockCommentPersistenceImpl extends AbstractMockDatabaseModel<Comment> implements ICommentPersistence {
  private final IDatabases databases;

  private static AtomicInteger curId = new AtomicInteger(1);

  public BaseMockCommentPersistenceImpl(IDatabases databases) {
    super();
    this.databases = databases;
  }

   @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    throw new RuntimeException("Not yet implemented"); // Not yet implemented
  }


  public Comment create(final String content, final Integer commenter_id, final Integer commented_on_id, final long created_at) throws IOException {
    int __id = curId.getAndIncrement();
    Comment newInst = new Comment(__id, content, commenter_id, commented_on_id, created_at, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }



  public Comment create(final long created_at) throws IOException {
    int __id = curId.getAndIncrement();
    Comment newInst = new Comment(__id, null, null, null, created_at, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Comment> find(Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(fieldsMap);
  }
}
