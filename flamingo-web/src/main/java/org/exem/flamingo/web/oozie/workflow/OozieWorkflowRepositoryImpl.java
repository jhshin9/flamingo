package org.exem.flamingo.web.oozie.workflow;

import org.exem.flamingo.shared.core.repository.PersistentRepositoryImpl;
import org.exem.flamingo.web.jdbc.FlamingoSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by sanghyunbak on 2016. 12. 1..
 */

@Repository
public class OozieWorkflowRepositoryImpl extends PersistentRepositoryImpl implements OozieWorkflowRepository {

  @Override
  public String getNamespace() {
    return this.NAMESPACE;
  }

  @Autowired
  public OozieWorkflowRepositoryImpl(FlamingoSessionTemplate flamingoSessionTemplate) {
    super.setSqlSessionTemplate(flamingoSessionTemplate);
  }

  @Override
  public Map selectTreeId(String jobId) {
    return this.getSqlSessionTemplate().selectOne(this.getNamespace() + ".selectJobId", jobId);
  }

  @Override
  public List<Map> listWorkflows() {
    return this.getSqlSessionTemplate().selectList(this.getNamespace() + ".listWorkflows");
  }

  @Override
  public void insertWorkflow(Map param) {
    this.getSqlSessionTemplate().insert(this.getNamespace() + ".insertWorkflow", param);
  }
}